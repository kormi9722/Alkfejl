insert into team(name) values ('Fradi');
insert into team(name) values('Újpest');

insert into ticket(fixture, bets, user_id) values(1,30, 'Good');
insert into ticket(fixture, bets, user_id ) values(2,300, 'Middle');
insert into ticket(fixture, bets, user_id) values(3,-30, 'Bad');


insert into league(name) values('Indigo');
insert into league(name) values('Orange');

insert into league_user(leagues_id, user_id) values(1,1);
insert into league_user(leagues_id, user_id) values(2,2);
insert into league_user(leagues_id, user_id) values(1,3);


insert into user (name, username, password, enabled, role, points) values ('Sanyi', 'admin', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_ADMIN', 0);
insert into user (name, username, password, enabled, role, points) values ('Karcsi','user1', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_USER', 10); 
insert into user (name, username, password, enabled, role, points) values ('Aranka','user2', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_USER', 30); 