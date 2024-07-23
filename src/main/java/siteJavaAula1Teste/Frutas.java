package siteJavaAula1Teste;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/siteJavaAula1Teste/Frutas.java") // Corrigido o caminho do servlet
public class Frutas extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Frutas() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        response.setContentType("text/html");

        String[] values = request.getParameterValues("Frutas");
        printWriter.println("Frutas que você selecionou: <ul>");

        if (values != null) {
            for (String value : values) {
                printWriter.println("<li>" + value + "</li>");
            }
        }
        printWriter.println("</ul>");
        printWriter.close();

    }
}