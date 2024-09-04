package com.noteric.p1.Service;

import com.noteric.p1.model.Address;
import com.noteric.p1.model.ContactInformation;
import com.noteric.p1.model.Course;
import com.noteric.p1.model.StudentInformation;

import javax.imageio.stream.ImageInputStream;

public class RegisterForm {

public StudentInformation studentInformation;
public Address address;
public ContactInformation contactInformation;
public Course course;

    public static void main(String[] args) {




            RegisterForm registerForm = new RegisterForm();
            StudentInformation studentInformation1 = new StudentInformation();
            studentInformation1.firstName = "kalyani";
            studentInformation1.lastName = "gandu";
            studentInformation1.dateOfBirth = "12-1-2003";
            studentInformation1.studentId = 123;
            ContactInformation contactInformation1 = new ContactInformation();
            contactInformation1.email = "kallu@2345";
            contactInformation1.phoneNo = "9553456679";
            Course course1 = new Course();
            course1.courseName = "Accounting";
            course1.language = "English";
            course1.level = "Level1/Level2";
            course1.startDate = "19-06-2024";
            Address address1 = new Address();
            address1.pincode = "50700";
            address1.area = "kbhp";
            address1.city = "hyd";
        System.out.println(registerForm.address = address1);
        System.out.println( registerForm.contactInformation = contactInformation1);
        System.out.println( registerForm.course = course1);
            System.out.println(registerForm.studentInformation = studentInformation1);
        }

    }

