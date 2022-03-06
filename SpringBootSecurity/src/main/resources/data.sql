INSERT INTO users (username, password, enabled) VALUES ('Admin', 'Admin', true);
INSERT INTO authorities (username, authority) VALUES ('Admin', 'ROLE_ADMIN');
INSERT INTO users (username, password, enabled) VALUES ('User', 'User', true);
INSERT INTO authorities (username, authority) VALUES ('User', 'ROLE_USER');