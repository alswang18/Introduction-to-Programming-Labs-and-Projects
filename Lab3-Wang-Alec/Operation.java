/**
 * Description: This is the interface for all the operations. This allows all classes to have an operate function and a getOperationName function.
 * 
 *
 * @author Alec Wang
 * @version Feb 11 2020
 */

/*
I have not discussed the Java language code 
in my program with anyone other than my instructor 
or the teaching assistants assigned to this course.

I have not used Java language code obtained 
from another student, or any other unauthorized 
source, either modified or unmodified.

If any Java language code or documentation 
used in my program was obtained from another source, 
such as a text book or webpage, those have been 
clearly noted with a proper citation in the comments 
of my code.
*/
public interface Operation{
	public void operate(Integer[] a);
	public String getOperationName();
}