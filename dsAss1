create TABLE Salespeople(Snum number primary key, Sname varchar2(20), City varchar2(20), Commission number)

begin
INSERT INTO Salespeople values(1,'Somesh','Dhule',500);
INSERT INTO Salespeople values(2,'Sritam','Durgapur',300);
INSERT INTO Salespeople values(3,'Pratik','Kolhapur',400);
INSERT INTO Salespeople values(4,'Avduth','Sangli',900);
INSERT INTO Salespeople values(5,'Sushant','Nagar',300);
INSERT INTO Salespeople values(6,'Rishab','',300);
INSERT INTO Salespeople values(7,'Ganesh','Nagar',100);
INSERT INTO Salespeople values(8,'Milind','Dhule',800);
INSERT INTO Salespeople values(9,'Goraesh','Dhule',100);
INSERT INTO Salespeople values(10,'Yash','Dhule',200);

end;

select * FROM Salespeople

create TABLE Orders(Onum number primary key, Odate date, Snum number references Salespeople(Snum), Amt number)

begin
INSERT INTO Orders values(1,'1-jan-16',1,5000);
INSERT INTO Orders values(2,'1-feb-16',2,6000);
INSERT INTO Orders values(3,'2-aug-20',3,3000);
INSERT INTO Orders values(4,'11-Mar-05',4,7000);
INSERT INTO Orders values(5,'30-dec-15',5,2000);
INSERT INTO Orders values(6,'1-aug-16',3,5000);
INSERT INTO Orders values(7,'1-feb-16',2,6000);
INSERT INTO Orders values(8,'18-Mar-05',3,3000);
INSERT INTO Orders values(9,'11-mar-17',3,7000);
INSERT INTO Orders values(10,'30-jun-15',5,2000);
end;

select * FROM Orders

create TABLE Customers(Cnum number primary key, Cname varchar2(20), City varchar2(20), Rating number, Snum number references Salespeople(Snum))

begin
INSERT INTO Customers values(1, 'Aakash', 'Pune' ,200, 3);
INSERT INTO Customers values(2, 'Bhuvensh', 'Nashik' ,200, 2);
INSERT INTO Customers values(3, 'Chaitanya', 'Pune' ,150, 4);
INSERT INTO Customers values(4, 'Danish', 'Nashik' ,180, 5);
INSERT INTO Customers values(5, 'Emily', 'Nashik' ,100, 4);
INSERT INTO Customers values(6, 'Frioz', 'Dhule' ,90, 2);
INSERT INTO Customers values(7, 'Ganesh', 'Dhule' ,50, 1);
INSERT INTO Customers values(8, 'Hitesh', 'Mumbai' ,120, 1);
INSERT INTO Customers values(9, 'Indira', 'Nagar' ,110, 3);
INSERT INTO Customers values(10, 'Jack', 'Chopda' ,90, 1);
INSERT INTO Customers values(11, 'Khushi', 'Nagar' ,130, 2);
INSERT INTO Customers values(12, 'Laxman', 'Chopda' ,170, 3);
INSERT INTO Customers values(13, 'Mangesh', 'Pune' ,80, 5);
INSERT INTO Customers values(14, 'Nagesh', 'Delhi' ,100, 4);
INSERT INTO Customers values(15, 'Om', 'Aurangabad' ,150, 2);
end;

select * FROM Customers


select * FROM Salespeople

--Q2
select * FROM Salespeople where City = 'Dhule' ORDER BY 'Commission';
--UPDATE Salespeople SET City='' where Snum = 6;

--Q3
select * from Orders where Odate<'2-jun-16';

--Q4
select distinct Snum FROM Orders;

--Q5
ALTER TABLE Salespeople add(Pincode number);

--Q6
ALTER TABLE Salespeople Modify(City Varchar2(100));

--Q7
select * FROM Customers where City!='Pune'AND City!='Delhi' AND City!='Surat' AND Rating>100;

--Q8
select * FROM Orders where Odate >= '10-Mar-05' AND Odate < '30-mar-05';

--Q9
select * FROM Salespeople where Sname like 'G%';

--Q10
select * FROM Salespeople where Sname like 'G__a%';

--Q11
select * FROM Salespeople where City is NULL;
