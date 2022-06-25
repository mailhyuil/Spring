# 원데이 프로젝트

- tablespace 생성
```
CREATE TABLESPACE MEMO
DATAFILE 'C:/oraclexe/data/memo.dbf'
SIZE 1M AUTOEXTEND ON NEXT 1K;
```

- 사용자 생성
```
CREATE USER memo IDENTIFIED BY 1234
DEFAULT TABLESPACE MEMO;
```