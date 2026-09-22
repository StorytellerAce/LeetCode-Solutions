select (
    CASE 
        WHEN id % 2 = 1  AND id != (SELECT COUNT(*) from SEAT) THEN id + 1
        WHEN id % 2 = 0 THEN id - 1 
        ELSE id
    END
) as id, student
from Seat
order by id asc;

# note: count (*) is not as good as max(id) because it will not work if there are missing ids in the table.
# note2: asc not needed, because its the default order, but I like to be explicit.