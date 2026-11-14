package oopsConceptsInJava;
import java.io.*;

 class JavaInputOutputFileStream {
	
	public static void main (String args[]) throws IOException {
		FileReader sourceStream = null;
		
		try {
			sourceStream = new FileReader("C:\\Users\\premk\\eclipse-workspace\\JavaPracticeProblems\\src\\oopsConceptsInJava\\inputTest.txt");
			int temp;
			while((temp = sourceStream.read())!=-1)
			{
				System.out.print((char) temp);
			}
		}
		catch(Exception e)
		{
			System.out.println(
		            "Working Directory: " + System.getProperty("user.dir")
		        );
			System.out.println("IO Exception occured: "+ e.getMessage());
			
		}
		finally {
			
			if(sourceStream!=null)
			{
				sourceStream.close();
			}
			
		}
	}
}