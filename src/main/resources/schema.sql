CREATE TABLE IF NOT EXISTS Run (
    id INT NOT NULL,
    title varchar(225) NOT NULL,
    started_on timestamp NOT NULL,
    completed_on timestamp NOT NULL,
    miles INT NOT NULL,
    location varchar(10) NOT NULL,
    PRIMARY KEY (id)
);

