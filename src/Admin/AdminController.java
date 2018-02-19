package Admin;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.SQLException;

public class AdminController implements Initializable{
    @FXML
    private TableView<StudantDatd> studentTable;
    @FXML
    private TableColumn<StudantDatd, String> idColumn;

    @FXML
    private TableColumn<StudantDatd, String> FirsNameColumn;

    @FXML
    private TableColumn<StudantDatd, String> LastNameColumn;

    @FXML
    private TableColumn<StudantDatd, String> EmailColumn;

    @FXML
    private TableColumn<String, String> dobColumn;
    @FXML
    private TextField searTxt;

    private bdConnection db;
    private ObservableList<StudantDatd> datd;


    @FXML
    private  void loadStudentData(ActionEvent event){
        try {
            Connection conn = dbCoonnection.getConnection();
                    this.data = FXCollections.observableArrayList();
            String sql = "select * from student";
                    ResultSet rs conn.createStatement().executeQuery(sql);

                    while (rs.next()){
                this.data.add(new StudantDatd(rs.getString(1),(rs.getString(2),(rs.getString(3),(rs.getString(4),(rs.getString(5)))))))
                    }
    }catch (SQLException e){
            e.printStackTrace();
        }
        this.idColumn.setCellValueFactory(new Propertyvaluefactory<StudantDatd.String>"ID"));
        this.FirsNameColumn.setCellValueFactory(new Propertyvaluefactory<StudantDatd.String>"FirstName"));
        this.LastNameColumn.setCellValueFactory(new Propertyvaluefactory<StudantDatd.String>"LastName"));
        this.EmailColumn.setCellValueFactory(new Propertyvaluefactory<StudantDatd.String>"Email"));
        this.dobColumn.setCellValueFactory(new Propertyvaluefactory<StudantDatd.String>"DOB"));
this.studentTable.set
}
//Filter
FileterdList<studentdata> fileterdData = new FilteredList<>(data,e -> true);
    searTxt.setOnKeyReleased(e ->{searTxt().addListener(doservable,oldValue,);});
    fiteredData.set
if (newValue==null || newVAlue.isEmpty()){
    return true;
    }
    String lowerCaseFilter = newValue.toLowerCase();
if (StudentData.getID().contains(newValuue)){
    return true;
    }else if



});
SortedList,<StudentData> sortedData = new
        SortedData.comparatorPropertr().bind(Student)
}