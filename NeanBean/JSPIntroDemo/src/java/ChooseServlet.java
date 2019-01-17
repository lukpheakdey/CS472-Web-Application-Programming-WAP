
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;

/**
 * @author lukpheakdey
 */
public class ChooseServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
        dispatch.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        RadioState radioState = new RadioState();
        String choice = request.getParameter("radioJSPCool");
        if(choice != null){
            if(choice.equals("1")){
                radioState.setYesCheck("checked");
            } else if(choice.equals("0")){
                radioState.setNoCheck("checked");
            }
            session.setAttribute("radioState", radioState);
        }
        
        RadioState radioState2 = new RadioState();
        String choice2 = request.getParameter("JSFwayCool");
        if(choice2 != null){
            if(choice2.equals("1")){
                radioState2.setYesCheck("checked");
            } else{
                radioState2.setNoCheck("checked");
            }
            session.setAttribute("radioState2", radioState2);
        }
        
        RadioState radioState3 = new RadioState();
        String choice3 = request.getParameter("moonCheese");
        if(choice3 != null){
            if(choice3.equals("1")){
                radioState3.setYesCheck("checked");
            } else {
                radioState3.setNoCheck("checked");
            }
            session.setAttribute("radioState3", radioState3);
        }
        
//        String choice = request.getParameter("radioJSPCool");
//        if(choice != null){
//            System.out.println("choice="+ choice);
//            System.out.println("No choice made");
//            RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
//            dispatch.forward(request, response);
//        }
        
        RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
        dispatch.forward(request, response);
        
    }

}
