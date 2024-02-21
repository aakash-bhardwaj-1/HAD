show databases;
use swasth_sahayak_backend;
INSERT INTO fieldworker_details (name, mobileno, gender) VALUES 
('John Doe', 1234567890, 'Male'),
('Jane Smith', 1234567891, 'Female'),
('Emily Johnson', 1234567892, 'Female'),
('Michael Brown', 1234567893, 'Male'),
('Sarah Davis', 1234567894, 'Female');

INSERT INTO doctor_details (name, mobileno, dateofjoining, gender, workingaddress, pinecode, blockcode, specialization,countofpatient) 
VALUES 
('John Doe', 234567890, '2024-02-10', 'Male', '123 Main St, CityName', 123456, 111, 'Specialization1',100),
('Jane Smith', 345678901, '2024-02-11', 'Female', '456 Market St, CityName', 654321, 222, 'Specialization2',100),
('Alice Johnson', 456789012, '2024-02-12', 'Female', '789 Broadway St, CityName', 234567, 333, 'Specialization3',100),
('Bob Brown', 467890123, '2024-02-13', 'Male', '101 First St, CityName', 345678, 444, 'Specialization4',100),
('Carol White', 678901234, '2024-02-14', 'Female', '202 Second St, CityName', 456789, 555, 'Specialization5',100);

INSERT INTO patient_details (abhaid, name, mobileno, dob, preferredlanguage, gender, Address, pincode, blockcode) VALUES
(1, 'John Doe', 234567890, '1990-01-01', 'English', 'Male', '1234 Main St', 123456, 101),
(2, 'Jane Smith', 345678901, '1991-02-02', 'Spanish', 'Female', '5678 Broadway Ave', 234567, 102),
(3, 'Jim Brown', 456789012, '1992-03-03', 'French', 'Male', '91011 Second St', 345678, 103),
(4, 'Jessica White', 467890123, '1993-04-04', 'German', 'Female', '121314 Third Ave', 456789, 104),
(5, 'William Black', 678901234, '1994-05-05', 'Chinese', 'Male', '151617 Fourth Blvd', 567890, 105);

INSERT INTO doctor_encrypt_id (username,did) VALUES
('aakash123',1),
('priyanshu123',2),
('jass123',3),
('abhishek123',4),
('farman123',5);

INSERT INTO field_worker_id_encrypt (fieldworkerid,fid) VALUES
('aakash12',1),
('priyanshu12',2),
('jass12',3),
('abhishek12',4),
('farman12',5);

INSERT INTO patient_fieldworker_mapping(fieldworkerid,patientid) VALUES
(1,1),
(1,2),
(2,3),
(2,4),
(3,5);

INSERT INTO icd10_mapping(icd10, disease) VALUES
('F00', 'General'),
('F32.1', 'Major Depressive Disorder'),
('F41.1', 'Generalized Anxiety Disorder'),
('F31', 'Bipolar Disorder'),
('F20', 'Schizophrenia'),
('F42', 'Obsessive-Compulsive Disorder');


INSERT INTO follow_up_data (patientfieldworkermappingid, icd10, followupdate,doctorid) VALUES
(1, 'F32.1', '2023-01-01',1),
(2, 'F32.1', '2023-02-15',2),
(3, 'F41.1', '2023-03-20',1),
(4, 'F32.1', '2023-04-25',3),
(1, 'F41.1', '2023-01-10',1),
(2, 'F31', '2023-02-25',2),
(3, 'F31', '2023-03-20',1),
(4, 'F20', '2023-04-25',3),
(5, 'F42', '2023-05-30',4);

INSERT INTO visited_follow_up_history (followupid,patientfieldworkermappingid, icd10,visited, followupdate,doctorid) VALUES
(4,1, 'A00',true, '2022-01-01',1),
(5,2, 'B01', true,'2022-02-15',2),
(6,3, 'C02', true,'2022-03-20',3);

INSERT INTO visits_to_reschedule (followupid,patientfieldworkermappingid, icd10,visited, followupdate,doctorid) VALUES
(2,1, 'A00',false, '2022-01-01',3),
(3,2, 'B01', false,'2022-02-15',4),
(4,3, 'C02', false,'2022-03-20',5);

INSERT INTO patient_doctor_mapping (abhaid, doctorid) VALUES
(1, 1),
(2, 1),
(3, 3),
(4, 2),
(6,1),
(7,1),
(5, 2);

INSERT INTO prescription_table (diseasename, doctorcomment, doctorid, pid, prescription, prescriptiondate) VALUES
('Depression', 'Patient showing improvement with current medication.', 1, 1, 'Sertraline 50 mg daily', '2023-01-15 10:30:00'),
('Anxiety', 'Recommend starting therapy sessions.', 2, 2, 'Escitalopram 10 mg daily', '2023-02-20 09:15:00'),
('Bipolar Disorder', 'Adjusting dosage due to side effects.', 3, 1, 'Lamotrigine 100 mg daily, Lithium 300 mg twice a day', '2023-03-25 08:45:00'),
('PTSD', 'Continued progress, keep dosage.', 4, 3, 'Prazosin 1 mg at bedtime', '2023-04-30 14:00:00'),
('ADHD', 'Patient to monitor attention levels and report.', 5, 5, 'Adderall XR 20 mg daily', '2023-05-05 16:30:00');

