package Servlets;

import Classes.Situation;
import Databases.DBproccessor;
import Databases.Product;


import java.io.IOException;
import java.sql.*;


/**
 * Created by Denis on 12.09.2016.
 */
public class QHandler extends javax.servlet.http.HttpServlet {

    static String question;

    public String getQuestion() {
        return question;
    }

     static String answer;

    public String getAnswer()  {
        return answer;
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws  javax.servlet.ServletException,IOException{
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        question = request.getParameter("question"); // получаем вопрос, введеный юзером, присваиваем переменной question

        Situation situation = new Situation();


        try {
            situation.searchSubjects(); // вызываем метод поиска по ключевым словам
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        answer = situation.getAnswer();


//      после получения ответа, мы обновляем страницу, чтобы на ней появился ответ
        String redirectURL = "http://localhost:8080/adviser.net/index1.jsp";
        response.sendRedirect(redirectURL);
    }




}
