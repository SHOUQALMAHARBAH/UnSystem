package com.mays;

class Faculty {
    private String name;
    private ContactInfo contactInfo;

    public Faculty(String name, ContactInfo contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", contactInfo=" + contactInfo +
                '}';
    }
}
