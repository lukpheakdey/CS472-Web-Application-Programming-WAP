
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lukpheakdey
 */

public class CalculatorImproved extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Servlet AdvanceCalculatorServlet< /title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Servlet AdvanceCalculatorServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<form method='post' action='calculator2.do'>");
        
        int number1 = 0, number2 = 0, number3 = 0, number4 = 0, resultAdd = 0, resultMulit = 0;
        
        if (request.getParameter("add_number1")!=null && request.getParameter("add_number1") != null) {
            number1 = Integer.parseInt(request.getParameter("add_number1"));
            number2 = Integer.parseInt(request.getParameter("add_number2"));
            resultAdd = number1 + number2;
        }
        if (request.getParameter("mulit_number1")!=null && request.getParameter("mulit_number2") != null) {
            number3 = Integer.parseInt(request.getParameter("mulit_number1"));
            number4 = Integer.parseInt(request.getParameter("mulit_number2"));
            resultMulit = number3 * number4;
        }
        
        request.setAttribute("resultAdd", resultAdd);
        request.setAttribute("resultMulit", resultMulit);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
