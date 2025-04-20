import io.restassured.path.json.JsonPath;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;

public class ComplexJsonParse {

    public static void main(String[] args){

        JsonPath js = new JsonPath(Payload.CoursePrice());
        //Print Number of Courses

        int count = js.getInt("courses.size()");
        System.out.println("Number of Courses:" +count);

        //Print Purchase Amount
        int totalAmount = js.getInt("dashboard.purchaseAmount");
        System.out.println("Total Purchase Amount is: " +totalAmount);

        //Print Title of the first course
        String first_Course = js.getString("courses[0].title");
        System.out.println("First Course Name: " +first_Course);

        //Print all course titles and their respective prices
        for(int i=0; i<count; i++)
        {
            String courseTitle = js.get("courses["+i+"].title");
            System.out.println(js.get("courses["+i+"].price").toString());
            System.out.println("All the Course Title and Price are: " +courseTitle);
        }

        System.out.println("Print no of copies sold by RPA Course");
        for( int j=0; j<count; j++){
            String courseTitels = js.get("courses["+j+"].title");
            if(courseTitels.equalsIgnoreCase("RPA"))
            {
                int copies = js.get("courses["+j+"].copies");
                System.out.println(copies);
                break;
            }
        }



    }
}