import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * @author lukpheakdey
 */
public class Calculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Calculator Lab";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
        
        out.println(docType + "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<h1 align = \"center\">" + title + "</h1>\n");
        
        if(request.getParameter("add_number1") != null && request.getParameter("add_number2") !=null){
            double add1 = Double.parseDouble(request.getParameter("add_number1"));
            double add2 = Double.parseDouble(request.getParameter("add_number2"));
            double resultAdd = add1 + add2;
            out.println("<ul>\n" +
                      add1 + " + " +
                      add2 + " = " +
                      resultAdd +
                   "</ul>\n"
            );
        }
        
        if(request.getParameter("mulit_number1") != null && request.getParameter("mulit_number2") !=null){
            double mulit1 = Double.parseDouble(request.getParameter("mulit_number1"));
            double mulit2 = Double.parseDouble(request.getParameter("mulit_number2"));
            double resultMulit = mulit1 * mulit2;
            out.println("<ul>\n" +
                      mulit1 + " *  " +
                      mulit2 + " = " +
                      resultMulit +
                   "</ul>\n"
            );
        }
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
   
}
