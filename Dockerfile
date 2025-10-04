# 1️⃣ Chọn base image có JDK
FROM openjdk:17-jdk-slim

# 2️⃣ Chọn thư mục làm việc trong container
WORKDIR /app

# 3️⃣ Copy toàn bộ code vào container
COPY . /app

# 4️⃣ Compile code Java
RUN javac Main.java

# 5️⃣ Chỉ định lệnh chạy khi container start
CMD ["java", "Main"]
