
  CREATE TABLE shipwreck(
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(2000),
    conditions VARCHAR(255),
    depth INT(6),
    latitude DOUBLE,
    longitude DOUBLE,
    year_Discovered INT(6)
  );