CREATE SCHEMA IF NOT EXISTS dictionaries DEFAULT CHARACTER SET UTF8;

CREATE TABLE dictionaries.dictionary_1
(
  word VARCHAR(100) NOT NULL,
  reference_id INT NOT NULL,
  CONSTRAINT dictionary_1_word_uindex
  UNIQUE (word)
);

CREATE TABLE dictionaries.dictionary_2
(
  word VARCHAR(100) NOT NULL,
  reference_id INT NOT NULL,
  CONSTRAINT dictionary_1_word_uindex
  UNIQUE (word)
);

INSERT INTO dictionaries.dictionary_1(word,reference_id) values
    ('абажур',1),
    ('кинотеатр',2),
    ('самолет',3),
    ('человек',4),
    ('собака',5);

INSERT INTO dictionaries.dictionary_2(word,reference_id) values
    ('человек',10),
    ('кинотеатр',11),
    ('писатель',33),
    ('машина',13),
    ('дом',14);