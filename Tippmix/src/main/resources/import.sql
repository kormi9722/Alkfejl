insert into team(name) values ('Fradi');
insert into team(name) values('Újpest');

insert into ticket(id, fixture, user_id) values(1, 30, 1);
insert into ticket(id, fixture, user_id) values(2, 300, 1);
insert into ticket(id, fixture, user_id) values(3, -30, 2);

insert into user(name, POINTS) values('Sanyi', 10);
insert into user(name, POINTS) values('Karcsi', 0);
insert into user(name, POINTS) values('Aranka', 5);

insert into league(name) values('Indigo');
insert into league(name) values('Orange');

insert into league_user(leagues_id, user_id) values(1,2);
insert into league_user(leagues_id, user_id) values(2,1);
insert into league_user(leagues_id, user_id) values(2,3);

-- insert into user (username, password, enabled, role) values ('admin', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_ADMIN');
-- insert into user (username, password, enabled, role) values ('user', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_USER'); 
