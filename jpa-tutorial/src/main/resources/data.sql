DROP TABLE IF EXISTS book;

CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `author` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `book` (`title`, `author`)
 VALUES ('Spring Boot in Action', 'Craig Walls');
 
 INSERT INTO `book` (`title`, `author`)
 VALUES ('Effective Java', 'Craig Walls');
 
 INSERT INTO `book` (`title`, `author`)
 VALUES ('Clean Code', 'Robert C. Martin');
 
 INSERT INTO `book` (`title`, `author`)
 VALUES ('Java Concurrency in Practice', 'Brian Goetz');
 
 INSERT INTO `book` (`title`, `author`)
 VALUES ('Design Patterns', 'Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides');