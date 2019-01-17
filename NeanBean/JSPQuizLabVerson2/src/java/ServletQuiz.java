import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author lukpheakdey
 */

public class ServletQuiz extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String option = request.getParameter("option");
        
        if(option != null && "STARTOVER".equals(option)){
            session.setAttribute("score", 0);
            session.setAttribute("attempts", 0);
            session.setAttribute("quiz", new Quiz());
            
            Quiz quiz = (Quiz) session.getAttribute("quiz");
            session.setAttribute("currentQuestion", quiz.getNextQuestion());
            session.setAttribute("currentHint", quiz.getHint());
            session.setAttribute("currentAnswer", quiz.getAnswer());
            request.setAttribute("errorMsg", "");
            request.setAttribute("tryMsg", "");
            
            RequestDispatcher dispatch = request.getRequestDispatcher("quiz.jsp");
            dispatch.forward(request, response);
            return;
        }

        String errorMsg = "";

        // Get The Quiz Object
        Object obj = session.getAttribute("quiz");
        if(obj == null){
            session.setAttribute("quiz", new Quiz());
        }
        Quiz quiz = (Quiz)session.getAttribute("quiz");
        
        // Object Score
        Object score = session.getAttribute("score");
        if(score == null){
            session.setAttribute("score", 0);
        }
        
        // Object Attemp
        Object attempts = session.getAttribute("attempts");
        if(attempts == null){
            session.setAttribute("attempts", 0);
        }
        
        String guess = request.getParameter("guess");
        String tryMsg = "";
        boolean goNext = Boolean.FALSE;
        
        if(guess != null && !"".equals(guess) && "".equals(errorMsg)){
            Integer tries = (Integer) session.getAttribute("attempts");
            Integer answer = (Integer) session.getAttribute("currentAnswer");
            Integer sc = (Integer) session.getAttribute("score");
            
            if(answer == Integer.parseInt(guess)){
                if(tries <=0){
                    session.setAttribute("score", sc + 10);
                } else if(tries == 1){
                    session.setAttribute("score", sc + 5);
                } else if(tries == 2){
                    session.setAttribute("score", sc + 2);
                }
                goNext = Boolean.TRUE;
                tryMsg = "";
            } else{
                tries++;
                session.setAttribute("attempts", tries);
                if(tries == 3){
                    tryMsg = "No More Attempt! correct answer is " + answer;
                    request.setAttribute("answer", answer);
                } else{
                    tryMsg = "Your last answer was not correct! Please try again";
                }
            }
        }
        
        String forwardPage = "quiz.jsp";
        
        Object currentQuestion = session.getAttribute("currentQuestion");
        if(currentQuestion == null || goNext){
            if(quiz.hasQuestion()){
                session.setAttribute("attempts", 0);
                session.setAttribute("currentQuestion", quiz.getNextQuestion());
                session.setAttribute("currentHint", quiz.getHint());
                session.setAttribute("currentAnswer", quiz.getAnswer());
            } else{
                Integer sc = (Integer)session.getAttribute("score");
                request.setAttribute("grade", getGradeByScore(sc));
                forwardPage = "result.jsp";
            }
        }
        request.setAttribute("errorMsg", errorMsg);
        request.setAttribute("tryMsg", tryMsg);
        
        RequestDispatcher dispatch = request.getRequestDispatcher(forwardPage);
        dispatch.forward(request, response);
        
    }
    
    private String getGradeByScore(int score){
        if(score >= 45 && score <=50){
            return "A";
        } else if(score >= 35 && score <=44){
            return "B";
        } else if(score >=25 && score <=34){
            return "C";
        } else{
            return "NC";
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
