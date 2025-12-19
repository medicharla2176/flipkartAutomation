package tejaspring1.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Table(name="Teja")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class database {
public Integer getStudentId() {
		return StudentId;
	}
	public void setStudentId(Integer studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
@Column (name="S_ID")
@Id
@GeneratedValue

private Integer StudentId;

@Column(name="S_Name")

private String StudentName;
@Column (name="S_Address")
private String Address;
}


