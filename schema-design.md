# Smart Clinic Management - Database Schema

## Doctor
- doctor_id (PK, INT, AUTO_INCREMENT)
- name (VARCHAR)
- email (VARCHAR, UNIQUE)
- specialization (VARCHAR)
- available_times (TEXT)

## Patient
- patient_id (PK, INT, AUTO_INCREMENT)
- name (VARCHAR)
- email (VARCHAR, UNIQUE)
- phone (VARCHAR)
- dob (DATE)

## Appointment
- appointment_id (PK, INT, AUTO_INCREMENT)
- doctor_id (FK → Doctor)
- patient_id (FK → Patient)
- appointment_time (DATETIME)

## Prescription
- prescription_id (PK, INT, AUTO_INCREMENT)
- appointment_id (FK → Appointment)
- description (TEXT)
- created_at (TIMESTAMP)

## Token
- token_id (PK, INT, AUTO_INCREMENT)
- email (VARCHAR)
- token (VARCHAR)
- expiry (TIMESTAMP)
