import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;
/*
 * GraphicsProgram ში დაწერეთ მეთოდი, რომელსაც გადაეცემა გვერდის სიგრძე და რომელიც აბრუნებს წესიერ სამკუთხედს როგორც
 * ობიექტს(GPolygon შეგიძლიათ გამოიყენოთ) დაბრუნებული სამკუთხედის კოორდინატი იყოს 0.0 (შემოხაზული მართკუთხედის 
 * ზედა მარცხენა კუთხიის კოორდინატი). მაგრამ უნდა მუშაობდეს add(triangle, x, y) ფუნქციონალიც.
 */
public class seminari10 extends GraphicsProgram{
	public void run(){
		int size = 100;
		add(drawAtriangle(size));
	}

	private GPolygon drawAtriangle(int size) {
		GPolygon triangle = new GPolygon();
		triangle.addVertex(0, 0);
		triangle.addVertex(size, 0);
		triangle.addVertex(size / 2, size * size * Math.sqrt(3) / 4);
		return triangle;
	}
}
