insert into POSTS (USER_ID, BODY)
VALUES (10, 'This is my new post');

update POSTS
set BODY = 'To delete'
where ID = 8;

delete from POSTS
where ID = 8;