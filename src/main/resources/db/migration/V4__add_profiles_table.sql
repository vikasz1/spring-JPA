Create TABLE profiles(
	id	BIGINT PRIMARY KEY,
	bio Text,
	phone_number varchar(15),
	date_of_birth Date,
	loyalty_points INT UNSIGNED DEFAULT 0,
	FOREIGN KEY (id) REFERENCES users(id)
);
