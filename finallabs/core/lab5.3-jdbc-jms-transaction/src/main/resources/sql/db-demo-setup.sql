
\connect camel_demo;

-- The rest of that script can be executed in the SQL Editor with the 'fuse_demo' database selected or in the shell
-- if there is a need to recreate the DB

DROP TABLE "Payments";

CREATE TABLE "Payments"
(
  "from" character varying(32),
  "to" character varying(32),
  "amount" double precision,
  "currency" character varying(32),
  id serial NOT NULL,
  CONSTRAINT primke PRIMARY KEY (id)
)
WITH (OIDS=FALSE);


DROP TABLE "ProcessedPayments";

CREATE TABLE "ProcessedPayments"
(
  "paymentIdentifier" character varying(32),
  id serial NOT NULL,
  CONSTRAINT processedpaymentspk PRIMARY KEY (id)
)
WITH (OIDS=FALSE);

