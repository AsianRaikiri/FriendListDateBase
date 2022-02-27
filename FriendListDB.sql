CREATE TABLE friend(
        friend_ID INT AUTO_INCREMENT,
        name VARCHAR(20) NOT NULL,
        lastName VARCHAR(20) DEFAULT "Unknown",
        sex VARCHAR(1) DEFAULT 'd',
        birthDate DATE DEFAULT '2000-01-01',
        occupation_ID INT,
        address VARCHAR(30),
        vacation_Budget INT DEFAULT 0,
        future_Dream VARCHAR(200),
        PRIMARY KEY(friend_ID)
);
CREATE TABLE hobby(
        hobby_ID INT AUTO_INCREMENT,
        hobby_Name VARCHAR(20) NOT NULL,
        hobby_Description VARCHAR(200),
        hobby_Monthly_Cost INT,
        PRIMARY KEY(hobby_ID)
);
CREATE TABLE interest(
        interest_ID INT AUTO_INCREMENT,
        interest_Name VARCHAR(30),
        interest_Description VARCHAR(200),
        PRIMARY KEY(interest_ID)
);
CREATE TABLE occupation(
        occupation_ID INT AUTO_INCREMENT,
        occupation_Name VARCHAR(20),
        occupation_Description VARCHAR(200),
        occupation_Average_Salary INT,
        PRIMARY KEY(occupation_ID)
);
CREATE TABLE vacation(
        vacation_ID INT AUTO_INCREMENT,
        vacation_Name VARCHAR(20),
        vacation_Type VARCHAR(50),
        vacation_Address VARCHAR(30),
        vacation_Cost INT,
        PRIMARY KEY(vacation_ID)
);
CREATE TABLE friend_hobbies(
        friend_ID INT,
        hobby_ID INT,
        PRIMARY KEY(friend_ID, hobby_ID),
        FOREIGN KEY(friend_ID) REFERENCES friend(friend_ID)
        ON DELETE CASCADE,
        FOREIGN KEY(hobby_ID) REFERENCES hobby(hobby_ID)
        ON DELETE CASCADE
);
CREATE TABLE friend_interests(
        friend_ID INT,
        interest_ID INT,
        PRIMARY KEY(friend_ID, interest_ID),
        FOREIGN KEY(friend_ID) REFERENCES friend(friend_ID)
        ON DELETE CASCADE,
        FOREIGN KEY(interest_ID) REFERENCES interest(interest_ID)
        ON DELETE CASCADE
);
CREATE TABLE friend_vacation(
        friend_ID INT,
        vacation_ID INT,
        PRIMARY KEY(friend_ID, vacation_ID),
        FOREIGN KEY(friend_ID) REFERENCES friend(friend_ID)
        ON DELETE CASCADE,
        FOREIGN KEY(vacation_ID) REFERENCES vacation(vacation_ID)
        ON DELETE CASCADE
);
ALTER TABLE friend
ADD FOREIGN KEY(occupation_ID)
REFERENCES occupation(occupation_ID)
ON DELETE SET NULL;





/*The most simple and useful Commands for SQL to work with tables*/
DESCRIBE friend;
ALTER TABLE friend ADD favoriteColor VARCHAR(10) DEFAULT "unknown";
INSERT INTO friend 
VALUES(1, 'Max', 'Tester', 'M', '2001-01-25', 0, 'Mustermannstraße 6', 300, 'Wants to travel the world');   
INSERT INTO friend (name, lastName, sex, birthDate, occupation_ID, address, vacation_Budget, future_Dream) 
VALUES('Anna', 'Storch', 'F', '2000-01-05', 1, 'Mustermann Allee 13', 450, 'Wants to eat the best food in the world.');
UPDATE friend
SET name = 'Alex'
WHERE friendID = 1;
DELETE from friend
WHERE friendID = 2;
SELECT * FROM friend;
SELECT name 
FROM friend
WHERE friend_id IN (
        SELECT friend_ID 
        FROM friend_hobbies
        WHERE hobby_ID = (
                SELECT hobby_ID
                FROM hobby
                WHERE hobby_name = "Minecraft"
        );
); /* Nested Query where you get the names of the friends who have the hobby which is named "Minecraft" */
DROP TABLE friend;
ALTER TABLE friend
MODIFY COLUMN future_Dream VARCHAR(200);
