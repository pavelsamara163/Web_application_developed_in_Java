package Classes;

//Класс, который будет определять на какую тему задан вопрос.
//Значение переменной question отправляется в этот класс,
//он его обрабатывает, смотрит по ключевым словам и решает
//на какую тему выдавать ответ.


import Servlets.QHandler;

import java.sql.SQLException;


public class Situation {


    private QHandler qHandler = new QHandler();
    //    private String currentQuestion = qHandler.getQuestion(); //вопрос заданый юзером
//    private String question = currentQuestion.toLowerCase(); //вопрос, который будет обрабатывать, всё в нижнем регистре
    String currentQuestion = qHandler.getQuestion(); // присваиваем переменной вопрос пользователя, полученный QHandler
    private String question = currentQuestion.toLowerCase(); //переводим все в нижний регистр
    private static String answer ; // этой переменной присваиваем полученный ответ с помощью метода "тематического" класса


    public String getAnswer()  {
        return answer;
    }

//    метод searchSubjects, который осуществляет поиск ключевых слов в строке
//    и передает решение о формировании ответа пользователю
//    соответствующему методу "тематического" класса

    public void searchSubjects() throws SQLException, ClassNotFoundException {
       if (question.contains("спать") || question.contains("не выспался") || question.contains("не высыпаться") || question.contains("отдыхать") || question.contains("дрыхнуть") || question.contains("баиньки") || question.contains("засыпать") || question.contains("прилечь") || question.contains("уснуть") || question.contains("сонное царство") || question.contains("спатиньки") || question.contains("посплю") || question.contains("поспать"))
           answer = Sleep.answer();
        if (question.contains("машина") || question.contains("автомобиль") || question.contains("тачка") || question.contains("авто") || question.contains("развалюха") || question.contains("автомашина"))
            answer = Car.answer();
         if(question.contains("работа") || question.contains("работать") || question.contains("трудится") || question.contains("вкалывать") || question.contains("труд") || question.contains("работка") || question.contains("подработка") || question.contains("работенка") || question.contains("должность") || question.contains("въебывать"))
               answer = Job.answer();
            if(question.contains("телефон") || question.contains("мобила") || question.contains("мобильник") || question.contains("сотовый") || question.contains("телефончик") || question.contains("таксофон"))
                answer = Telephone.answer();
                else{
                    //Создать и написать класс в который надо обращаться если пользователь пишет чушь
            }
    }
}