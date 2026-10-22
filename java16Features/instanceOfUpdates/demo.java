package instanceOfUpdates;

public class demo {
    void main(String[] args){
        Object obj = "Hello, World!";
        //Before java 16, we would have to use instanceof and cast the object to the desired type
        if(obj instanceof String){
            String s = (String) obj;
            System.out.println("String: " + s);
        }

        //After java 16, we can use pattern matching for instanceof to simplify the code
        if(obj instanceof String str){
            System.out.println("String: " + str);
        }
    }
}
