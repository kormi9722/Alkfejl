-- insert into team(name) values ('Fradi');
-- insert into team(name) values('Újpest');

insert into fixture (home, guest, result) values('Liverpool', 'Real Madrid', 'H');
insert into fixture (home, guest, result) values('Arsenal', 'Milan', 'G');
insert into fixture (home, guest, result) values('Barcelona', 'Dortmund', 'G');
insert into fixture (home, guest, result) values('Dortmund', 'Juventus', 'X');
insert into fixture (home, guest, result) values('Bayern Munich', 'Monaco', 'H');


insert into league(name) values('Indigo');
insert into league(name) values('Orange');

insert into user (name, username, password, enabled, role, points) values ('Sanyi', 'admin', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_ADMIN', 0);
insert into user (name, username, password, enabled, role, points) values ('Karcsi','user1', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_USER', 10); 
insert into user (name, username, password, enabled, role, points) values ('Aranka','user2', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_USER', 30); 

insert into ticket(user_id, fixture_id, bet) values(1,1, 'H');
insert into ticket(user_id, fixture_id, bet) values(2,3, 'X');
insert into ticket(user_id, fixture_id, bet) values(3,4, 'G');

insert into league_user(leagues_id, user_id) values(1,1);
insert into league_user(leagues_id, user_id) values(2,2);
insert into league_user(leagues_id, user_id) values(1,3);