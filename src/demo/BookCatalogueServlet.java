package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by 151642b on 10/24/2016.
 */
@WebServlet(name = "BookCatalogueServlet",urlPatterns = "/bookcatalog")
public class BookCatalogueServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();


       BookDBAO bd = new BookDBAO();
        List<BookDetails> ld = bd.getAllBooks();
        out.println("<html>");
        out.println("<body>");
        out.println("<table>");


        for(int i = 0; i<ld.size();i++){

            out.println("<tr>");
            out.println("<td>" +  ld.get(i).getTitle()+"</td>");
            out.println("<td>" +  ld.get(i).getDescription()+"</td>");
            out.println("<td>" +ld.get(i).getYear()+"</td>");


        }

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");

        out.close();

    }
}
