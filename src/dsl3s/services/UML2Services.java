package dsl3s.services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

public class UML2Services {
	
	protected String logFile = "/home/lads/Desktop/out.txt";
	
	 public boolean hasStereotype(Class clazz, String stereotypeName) throws IOException {
		 Boolean DEBUG = false;
		 PrintWriter out = null;
			
		 List<Stereotype> stereotypes = clazz.getAppliedStereotypes();
		 Stereotype st = clazz.getAppliedStereotype(stereotypeName);
		 
		 if(DEBUG) {
		 	out = new PrintWriter(new FileWriter(logFile));
			out.println("O nome do estereótipo principal: " + st.getName());
		}
		 
		 if (st != null) return true;
		 for (Stereotype stereotype : stereotypes) {
			 
			 if(DEBUG) out.println("No ciclo: " + stereotype.getName());

			 if (stereotype.getName().equals(stereotypeName)) {
				 return true;
			 }
		 }
		 return false;
	 }
	 
	 public boolean hasLinkedStereotype(Class c, String linkedStereotype) throws IOException {
		Boolean DEBUG = false;
		PrintWriter out = null;
		 
		if(DEBUG) {
			out = new PrintWriter(new FileWriter(logFile));
			out.println("hasLinkedStereotype!!!!!!!!!!!!!!!!! : " + c.getName() + " " + linkedStereotype);
			out.flush();
		}
	
		 EList<Association> associations = c.getAssociations();
		 
		 for (Association ass : associations) {
			 
			 EList<Element> elems = ass.getRelatedElements();
			 for (Element elm : elems) {
				 if(DEBUG) out.println("Elm: " + elm.toString());
				 
				 List<Stereotype> stereotypes = elm.getAppliedStereotypes();
				 for (Stereotype stereotype : stereotypes) {
					 if(DEBUG) out.println(" Stereo: " + stereotype.getName());
					 if (stereotype.getName().equals(linkedStereotype)) {
						 if(DEBUG) out.close();
						 return true;
					 }
				 }
			 }
		 }
		 
		 if(DEBUG) out.close();
		 return false;
	 }
	 
	public String getTaggedValue(Class c, String stereoTypeName, String propName) throws IOException {
		
		Boolean DEBUG = false;
		PrintWriter out = null;
		Stereotype st = null;
		
		String res = null;
		if(DEBUG)
			{
			out = new PrintWriter(new FileWriter(logFile, true));
			//out.println("Olá!");
			out.println("\n\n####################################");
			out.println("Class : " + c.getName());
			out.println("Stereo: " + stereoTypeName);
			out.println("Prpert: " + propName + "\n");
			}
		
		try {		
			
			 List<Stereotype> stereotypes = c.getAppliedStereotypes();
			 for (Stereotype stereotype : stereotypes) {
				 if(DEBUG) out.println("O nome: " + stereotype.getName());
				 if (stereotype.getName().equals(stereoTypeName)) {
					 st = stereotype;
				 }
			 }
			
			 if(DEBUG){
				 out.println(st.toString());
				 out.println("O stereo: " + st.getName());
			 }
			 
			Object val = c.getValue(st, propName);
			if(val != null)
				res = val.toString();
			
			if(DEBUG){
				out.println("O resultado:");
				out.println(res);
			}
		}
		catch (Exception ex) {
			if(DEBUG){
				out.println(ex.getMessage());
				out.println(ex.toString());
				ex.printStackTrace(out);
			}
			res = "Error in service!!!";
			
		}
		if(DEBUG) out.close();
		return res;
	}
	
	public String minimizeFirstChar(String name)
	{
		String first = name.substring(0, 1).toLowerCase();
		return first + name.substring(1);
	}
	
	 public boolean isNotNull(Class clazz) {
		 if (clazz == null) return false;
		 else return true;
	 }
	 
	 public boolean isNotNull(String str) {
		 
		Boolean DEBUG = false;
		PrintWriter out = null;
			
		if(DEBUG)
		{
			try {
				out = new PrintWriter(new FileWriter(logFile, true));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.println("A string: |" + str + "| len: " + str.length());
			out.close();
		}
			
		 if ((str == null) || (str.length() <= 0) || (str == "") || (str.equals("null"))) 
			 return false;
		 else return true;
	 }
	 
	 public boolean isNull(String str) 
	 {
		return !isNotNull(str);
	 }

}
