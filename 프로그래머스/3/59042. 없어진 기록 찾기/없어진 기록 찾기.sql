# SELECT o.ANIMAL_ID, o.NAME 
# from ANIMAL_OUTS o
# left join ANIMAL_INS i
# on i.ANIMAL_ID=o.ANIMAL_ID
# where i.ANIMAL_ID is null 
# order by o.ANIMAL_ID;

# 서브쿼리 풀이법(1)
# select o.id, o.name
# from out o
# where not in (
#     select 
#     from o
#     inner join i
#     on o.id=i.id
# );

# 서브쿼리 풀이법(2)
select ANIMAL_OUTS.ANIMAL_ID, ANIMAL_OUTS.NAME
from ANIMAL_OUTS
where ANIMAL_OUTS.ANIMAL_ID not in(select ANIMAL_ID from ANIMAL_INS);