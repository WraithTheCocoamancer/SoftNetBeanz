/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniDemo;

/**
 *
 * @author mhill9
 */
public class Course {

    private String code;
    private Lecturer teacher;
    private String coursework;
    private String room;
    public Course(String code, String room)
    {
     this.code = code;   
     this.room = room;
    }
    
}
