package com.spring;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class employ {
    private String employName;
    //taking multiple phone number of employee using list
    private List<String> contact;
    private Set<String> address;
    private Map<String,String> courses;

    public employ(String employName, List<String> contact, Set<String> address, Map<String, String> courses) {
        this.employName = employName;
        this.contact = contact;
        this.address = address;
        this.courses = courses;
    }

    public employ() {
        super();
    }

    @Override
    public String toString() {
        return "employ{" +
                "employName='" + employName + '\'' +
                ", contact=" + contact +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }

    public String getName() {
        return employName;
    }

    public void setName(String employName) {
        this.employName = employName;
    }

    public List<String> getContact() {
        return contact;
    }

    public void setContact(List<String> contact) {
        this.contact = contact;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }
}
