package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Reader {
	public static void main(String[]args){
		String filePath = "C:\\Users\\Md.Golam Robbani\\Desktop\\Homework 4\\Iphone5.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try{
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);
			String text = "";
			while((text = br.readLine())!=null){
				System.out.println(text);
			}
		}
			catch(Exception ex){
				ex.printStackTrace();
			}
			finally{
				if(br!=null){
					try{
						br.close();
					}catch(IOException e){
						e.printStackTrace();
						
					}
					if(fr!=null){
						try{
							fr.close();
						}catch(IOException ex){
							ex.printStackTrace();
						}
					}
				}
			}
			
		}
		
	}


