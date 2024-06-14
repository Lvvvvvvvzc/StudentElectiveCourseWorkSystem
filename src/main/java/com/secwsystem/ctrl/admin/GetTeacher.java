package com.secwsystem.ctrl.admin;

import com.secwsystem.dao.pojo.TeacherPrivate;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class GetTeacher implements Initializable {

    @FXML
    private Button btn_set;

    @FXML
    private Button btn_cancel;

    @FXML
    private TextField TeaId;

    @FXML
    private TextField TeaPassword;

    @FXML
    private TextField TeaName;

    @FXML
    private TextField TeaSex;

    @FXML
    private TextField TeaIdcard;

    @FXML
    private TextField TeaPhone;

    @FXML
    private TextField TeaSchool;

    @FXML
    private TextField TeaTitle;

    @FXML
    private TextField TeaEmail;

    @FXML
    private TextField TeaAddress;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AdminMainController controller = (AdminMainController) AdminContext.controllers.get(AdminMainController.class.getSimpleName());
        TeacherPrivate teacher = controller.getTeacher();
        TeaId.setText(teacher.getTid());
        TeaName.setText(teacher.getTName());
        TeaSex.setText(teacher.getTSex());
        TeaIdcard.setText(teacher.getTIdcard());
        TeaPhone.setText(teacher.getTPhoneNumber());
        TeaSchool.setText(teacher.getTSchool());
        TeaTitle.setText(teacher.getTTitle());
        TeaEmail.setText(teacher.getTEmail());
        TeaAddress.setText(teacher.getTAddress());
        TeaPassword.setText(teacher.getTPassword());
    }
}

