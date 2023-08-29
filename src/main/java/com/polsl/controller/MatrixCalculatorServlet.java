package com.polsl.controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.polsl.model.*;

/**
 *
 * @author Paulina Bodetko
 * @version 5.0
 */
@WebServlet("/MatrixCalculator")
public class MatrixCalculatorServlet extends HttpServlet {
	
    /**
     *
     * @param req request
     * @param resp response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String stringA = req.getParameter("matrixA");
        String stringB = req.getParameter("matrixB");

        Exception_handler E = new Exception_handler();
        PrintWriter out = resp.getWriter();

//        try {
//            E.checkInput(stringA, stringB);
//        } catch (inputException e) {
//            out.println("Bad input");
//            return;
//        }
        Calculation C = new Calculation();

        Matrix A = C.getMatrix(stringA);
        Matrix B = C.getMatrix(stringB);

        MatrixData AD = new MatrixData();
        AD.setValues(stringA);
        MatrixData BD = new MatrixData();
        BD.setValues(stringB);

        try {
            E.checkDimensions(A, B);
        } catch (dimensionException e) {
            out.println("Bad dimensions");
            return;
        }

        Matrix Result = null;
        CalculationData cData = new CalculationData();

        if (req.getParameter("addButton") != null) {
            Result = C.add(A, B);
            cData.setResult(Result.toString());
            cData.setSign('+');

        }
        if (req.getParameter("subtractButton") != null) {
            Result = C.subtract(A, B);
            cData.setResult(Result.toString());
            cData.setSign('-');
        }

        out.println("<html>\n<body>\n<h1>wynik: " + Result.toString() + "</h1>\n");
        
        Data_handler handler = new Data_handler();
        
        handler.persistObject(AD);
        handler.persistObject(BD);
        handler.persistObject(cData);
        handler.closeEntityManager();     
    }
}
