CREATE TABLE Friends (
        friend_ID INT AUTO_INCREMENT,
        name VARCHAR(20) NOT NULL,
        lastName VARCHAR(20) DEFAULT "Unknown",
        sex VARCHAR(10) DEFAULT 'undecided',
        age INT DEFAULT NULL,
        birthDate DATE DEFAULT '2000-01-01',
        primary_Hobby VARCHAR(20),
        secondary_Hobby VARCHAR(20),
        primary_Interest VARCHAR(30),
        secondary_Interest VARCHAR(30),
        occupation VARCHAR(20) DEFAULT 'student',
        adress VARCHAR(30),
        vacation_Budget INT DEFAULT 0,
        favorite_Vacation VARCHAR(20),
        secondary_Vacation VARCHAR(20),
        future_Dream VARCHAR(50),
        PRIMARY KEY(friend_ID)
);
CREATE TABLE Hobbies(
        hobby_Name VARCHAR(20) NOT NULL,
        hobby_Description VARCHAR(200),
        hobby_Monthly_Cost INT,
        PRIMARY KEY(hobby_Name)
);
CREATE TABLE Interests(
        interest_Name VARCHAR(30),
        interest_Description VARCHAR(200),
        PRIMARY KEY(interest_Name)
);
CREATE TABLE Occupations(
        occupation_Name VARCHAR(20),
        occupation_Description VARCHAR(200),
        occupation_Average_Salary INT,
        PRIMARY KEY(occupation_Name)
);
CREATE TABLE Vacation_Spots(
        vacation_Name VARCHAR(20),
        vacation_Type VARCHAR(50),
        vacation_Address VARCHAR(30),
        vacation_Cost INT,
        PRIMARY KEY(vacation_Name)
);
ALTER TABLE friends 
ADD FOREIGN KEY(primary_Hobby) 
REFERENCES hobbies(hobby_Name) 
ON DELETE SET NULL,
ADD FOREIGN KEY(secondary_Hobby)
REFERENCES hobbies(hobby_Name)
ON DELETE SET NULL,
ADD FOREIGN KEY(primary_Interest)
REFERENCES Interests(interest_Name)
ON DELETE SET NULL,
ADD FOREIGN KEY(secondary_Interest)
REFERENCES Interests(interest_Name)
ON DELETE SET NULL,
ADD FOREIGN KEY(occupation)
REFERENCES Occupations(occupation_Name)
ON DELETE SET NULL,
ADD FOREIGN KEY(favorite_Vacation)
REFERENCES Vacation_Spots(vacation_Name)
ON DELETE SET NULL,
ADD FOREIGN KEY(secondary_Vacation)
REFERENCES Vacation_Spots(vacation_Name)
ON DELETE SET NULL;






/*The most simple and useful Commands for SQL to know if your Tables are actually as you want them. */
DESCRIBE friends;
ALTER TABLE friends ADD favoriteColor VARCHAR(10) DEFAULT "unknown";
INSERT INTO friends VALUES(1, 'Max', 'Tester', 21, '2001-01-25', 'black');   
INSERT INTO friends (name, lastName, age, birthDate) VALUES('Anna', 'Storch', 22, '2000-01-05');
UPDATE friends
SET name = 'Alex'
WHERE friendID = 1;
DELETE from friends
WHERE friendID = 2;
SELECT * FROM friends;
DROP TABLE friends;