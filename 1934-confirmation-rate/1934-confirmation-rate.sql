# Write your MySQL query statement below
SELECT SIGNUPS.USER_ID,IFNULL(ROUND(SUM(ACTION = 'CONFIRMED')/SUM(ACTION = 'CONFIRMED' OR ACTION = 'TIMEOUT'),2),0) AS CONFIRMATION_RATE 
FROM SIGNUPS LEFT JOIN CONFIRMATIONS
ON SIGNUPS.USER_ID = CONFIRMATIONS.USER_ID
GROUP BY SIGNUPS.USER_ID;

