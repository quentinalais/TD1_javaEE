package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class StudentControler  implements Initializable  {
	
	@FXML
	Label name_id;
	@FXML
	ListView<String> list_id;
	@FXML
	TextField nom_id;
	@FXML
	ComboBox<String> gender_id;
	@FXML
	DatePicker birth_id;
	@FXML
	TextField mark_id;
	@FXML
	TextArea comments_id;
	
	@FXML
	ImageView photo_id;
	
	
	DBManager manager;
	
	
	@Override
	public void initialize(URL location, ResourceBundle ressource) {
		// TODO Auto-generated method stub
		
		manager = new DBManager();
		
		List<String> gvalues = new ArrayList<String>(); 
		gvalues.add("Male");
		gvalues.add("Female"); 
		ObservableList<String> gender = FXCollections.observableArrayList(gvalues); 
		
		
		
		gender_id.setItems(gender);
		
	
		fetchStudents();

	}
	
	
	public void fetchStudents() {
		
		ObservableList<String> students; 
		
		if (manager.loadStudents()!=null) {
			
			students= FXCollections.observableArrayList(manager.loadStudents()); 
			
			list_id.setItems(students); 
		}
	}
	
	

	
	
	
}
