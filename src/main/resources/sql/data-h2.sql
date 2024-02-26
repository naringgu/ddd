insert into book
(`book_id`, `title`, `author`, `isbn`, `company`, `create_date`, `status`)
values (1, '가나다라', '김', 'ISBN_1', 'aaa', '2024-01-01 00:00:00', 'AVAILABLE'),
       (2, '마바사', '이', 'ISBN_2', 'aaa', '2024-02-02 00:00:00', 'ON_LOAN'),
       (3, '아자차카', '박', 'ISBN_3', 'bbb', '2024-03-03 00:00:00', 'AVAILABLE'),
       (4, '타파하', '최', 'ISBN_4', 'bbb', '2024-04-04 00:00:00', 'ON_LOAN'),
       (5, '에이비씨', '정', 'ISBN_5', 'ccc', '2024-05-05 00:00:00', 'AVAILABLE');



insert into member
    (`member_id`, `name`, `phone_number`)
values (1, '김헌승', '010-1111-1111'),
       (2, '박산희', '010-2222-2222'),
       (3, '이나리', '010-3333-3333');



insert into reservation
(`reservation_id`, `member_id`, `book_id`, `reservation_date`, `status`)
values (1, 1, 1, '2024-02-19 00:00:00', 'RESERVED'),
       (2, 2, 2, '2024-02-20 00:00:00', 'LOANED'),
       (3, 3, 2, '2024-02-21 00:00:00', 'CANCELED');

