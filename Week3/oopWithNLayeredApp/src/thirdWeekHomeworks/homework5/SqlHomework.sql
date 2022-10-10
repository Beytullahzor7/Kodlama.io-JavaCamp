-- SELECT
SELECT *
FROM CUSTOMERS;

SELECT *
FROM CUSTOMERS
WHERE CITY = 'Berlin';

SELECT *
FROM PRODUCTS
WHERE CATEGORYID = 1
   OR CATEGORYID = 3;

SELECT *
FROM PRODUCTS
WHERE CATEGORYID = 1
  AND UNITPRICE >= 10;

SELECT *
FROM PRODUCTS
ORDER BY PRODUCTNAME;

SELECT *
FROM PRODUCTS
ORDER BY CATEGORYID, PRODUCTNAME;

SELECT *
FROM PRODUCTS
ORDER BY UNITPRICE ASC;

SELECT *
FROM PRODUCTS
ORDER BY UNITPRICE DESC;

SELECT COUNT(*)
FROM PRODUCTS;

SELECT COUNT(*) ADET
FROM PRODUCTS
WHERE CATEGORYID = 2;

SELECT COUNT(*), CATEGORYID
FROM PRODUCTS
GROUP BY CATEGORYID;

-- URUN SAYISI 10 DAN AZ OLAN KATEGORILERİ LİSTELE
SELECT CATEGORYID, COUNT(*)
FROM PRODUCTS
GROUP BY CATEGORYID
HAVING COUNT(*) < 10;

-- PRODUCTS TABLOSUNDAN UNITPRICE 20 DEN BUYUK OLAN URUNLERI FILTRELEYIP
-- CATEGORYE GORE GRUPLA VE SAYISI 10 DAN AZ OLANLARI GETIR
SELECT CATEGORYID, COUNT(*)
FROM PRODUCTS
WHERE UNITPRICE > 20
GROUP BY CATEGORYID
HAVING COUNT(*) < 10;

-- INNER JOIN
SELECT PRODUCTS.PRODUCTID, PRODUCTS.PRODUCTNAME, CATEGORIES.CATEGORYNAME
FROM PRODUCTS
         JOIN CATEGORIES ON PRODUCTS.CATEGORYID = CATEGORIES.CATEGORYID;

SELECT PRODUCTS.PRODUCTID, PRODUCTS.PRODUCTNAME, CATEGORIES.CATEGORYNAME
FROM PRODUCTS
         JOIN CATEGORIES ON PRODUCTS.CATEGORYID = CATEGORIES.CATEGORYID
WHERE PRODUCTS.UNITPRICE > 10;

SELECT *
FROM PRODUCTS P
         JOIN ORDERDETAILS OD ON P.PRODUCTID = OD.PRODUCTID;

SELECT *
FROM CUSTOMERS C
         LEFT JOIN ORDERS O ON C.CUSTOMERID = O.CUSTOMERID;

SELECT *
FROM CUSTOMERS C
         LEFT JOIN ORDERS O ON C.CUSTOMERID = O.CUSTOMERID
WHERE O.CUSTOMERID IS NULL;
































