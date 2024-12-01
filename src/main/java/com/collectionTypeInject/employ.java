package com.spring;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class employ {
    private String employName;
    //taking multiple phone number of employee using list
    private List<String> contact;
    private Set<String> address;
    private Map<String,String> courses;
    private Properties props;

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
                ", props=" + props +
                '}';
    }

    public employ(Properties props, Map<String, String> courses, Set<String> address, String employName, List<String> contact) {
        this.props = props;
        this.courses = courses;
        this.address = address;
        this.employName = employName;
        this.contact = contact;
    }

    public String getEmployName() {
        return employName;
    }

    public void setEmployName(String employName) {
        this.employName = employName;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public List<String> getContact() {
        return contact;
    }

    public void setContact(List<String> contact) {
        this.contact = contact;
    }
}
