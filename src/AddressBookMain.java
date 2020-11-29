public class AddressBookMain {
    public static void main(String[] args) {
        ContactDetails contactDetails = new ContactDetails();

        //setting the value of contact details
        contactDetails.setfName("Rohit");
        contactDetails.setlName("Bhat");
        contactDetails.setEmailId("rohit@gmail.com");
        contactDetails.setPhoneNumber("91 8083373213");
        contactDetails.setAddress("AnandNagar");
        contactDetails.setZip(804426);
        contactDetails.setCity("Jammu");
        contactDetails.setState("J&k") ;

        System.out.println("Details of Person" +contactDetails);
    }
}
