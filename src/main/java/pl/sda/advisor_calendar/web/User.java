package pl.sda.advisor_calendar.web;

import pl.sda.advisor_calendar.model.user.UserDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class User extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name = req.getParameter("imie");
       String surname = req.getParameter("nazwisko");
       String email = req.getParameter("email");
       String phoneNumber = req.getParameter("numer_telefonu");
       String reg = req.getParameter("reg");

       UserDTO user = new UserDTO();



    }
}
