package org.paschal.sat.objects;

/**
 *
 * @author Ian Travis
 */
public class Student {
    
    private String last, first, school, teacher, pName, pEmail, addr, city,
            state, zip, hPhone, cPhone, ethnicity, scholarship, entry, comments;
    private boolean returning;
    private int payment, paid, grade, session;
    private String[] classes;
    
    public Student(){
        
        classes = new String[4];
        
    }
    
    public void setLast(String e){

        last = e;

    }
    
    public void setFirst(String e){

        first = e;

    }
    
    public void setSchool(String e){

        school = e;

    }
    
    public void setTeacher(String e){

        teacher = e;

    }
    
    public void setPName(String e){

        pName = e;

    }
    
    public void setPEmail(String e){

        pEmail = e;

    }
    
    public void setAddr(String e){

        addr = e;

    }
    
    public void setCity(String e){

        city = e;

    }
    
    public void setState(String e){

        state = e;

    }
    
    public void setZip(String e){

        zip = e;

    }
    
    public void setHPhone(String e){

        hPhone = e;

    }
    
    public void setCPhone(String e){

        cPhone = e;

    }
    
    public void setEth(String e){

        ethnicity = e;

    }
    
    public void setScholarship(String e){

        scholarship = e;

    }
    
    public void setEntry(String e){

        entry = e;

    }
    
    public void setComments(String e){

        comments = e;

    }
    
    public String getLast(){

        return last;

    }
    
    public String getFirst(){

        return first;

    }
    
    public String getSchool(){

        return school;

    }
    
    public String getTeacher(){

        return teacher;

    }
    
    public String getPName(){

        return pName;

    }
    
    public String getPEmail(){

        return pEmail;

    }
    
    public String getAddr(){

        return addr;

    }
    
    public String getCity(){

        return city;

    }
    
    public String getState(){

        return state;

    }
    
    public String getZip(){

        return zip;

    }
    
    public String getHPhone(){

        return hPhone;

    }
    
    public String getCPhone(){

        return cPhone;

    }
    
    public String getEthn(){

        return ethnicity;

    }
    
    public String getScholarship(){

        return scholarship;

    }
    
    public String getEntry(){

        return entry;

    }
    
    public String getComments(){

        return comments;

    }
    
    public void setReturning(boolean e){
        
        returning = e;
        
    }
    
    public boolean getReturning(){
        
        return returning;
        
    }
    
    public void setPayment(int e){
        
        payment = e;
        
    }
    
    public int getPayment(){
        
        return payment;
        
    }
    
    public void setPaid(int e){
        
        paid = e;
        
    }
    
    public int getPaid(){
        
        return paid;
        
    }
    
    public void setGrade(int e){
        
        grade = e;
        
    }
    
    public int getGrade(){
        
        return grade;
        
    }
    
    public int getSession(){
        
        return session;
        
    }
    
    public void setSession(int e){
        
        session = e;
        
    }
    
    public String getFirstClass(){
        
        return classes[0];
        
    }
    
    public String getSecondClass(){
        
        return classes[1];
        
    }
    
    public String getThirdClass(){
        
        return classes[2];
        
    }
    
    public String getFourthClass(){
        
        return classes[3];
        
    }
    
    public void setClasses(String a, String b, String c, String d){
        
        classes = new String[]{a,b,c,d};
        
    }
    
}
