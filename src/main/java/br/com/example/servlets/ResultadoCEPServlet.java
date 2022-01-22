package br.com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.example.servicos.ResultadoCEP;

public class ResultadoCEPServlet extends HttpServlet {
    private static final long serialVersionUID = -2387491444867562667L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String resultado = ResultadoCEP.obtemCEP();

        System.out.println(resultado);

        out.flush();
        out.close();
    }
}