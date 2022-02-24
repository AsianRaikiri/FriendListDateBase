CREATE TABLE FriendList (
        friendID INT PRIMARY KEY AUTO_INCREMENT,
        name VARCHAR(20) NOT NULL,
        lastName VARCHAR(20) DEFAULT "Unknown",
        age INT DEFAULT NULL,
        birthDate DATE DEFAULT '2000-01-01'
);

/*The most simple and useful Commands for SQL to know if your Tables are actually as you want them. */
DESCRIBE friendlist;
ALTER TABLE friendlist ADD favoriteColor VARCHAR(10) DEFAULT "unknown";
INSERT INTO friendlist VALUES(1, 'Max', 'Tester', 21, '2001-01-25', 'black');   
INSERT INTO friendlist (name, lastName, age, birthDate) VALUES('Anna', 'Storch', 22, '2000-01-05');
UPDATE friendlist
SET name = 'Alex'
WHERE friendID = 1;
DELETE from friendlist
WHERE friendID = 2;
SELECT * FROM friendlist;
DROP TABLE friendlist;