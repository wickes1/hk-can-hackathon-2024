import winston from "winston";
import path from "path";

const logger = winston.createLogger({
  level: "info",
  format: winston.format.combine(
    winston.format.colorize({ all: true }),
    winston.format.timestamp({
      format: "YYYY-MM-DD HH:mm:ss",
    }),
    winston.format.errors({ stack: true }),
    winston.format.align(),
    winston.format.json()
  ),
  transports: [
    new winston.transports.Console(),
    new winston.transports.File({
      filename: "./logs/error.log",
      level: "error",
    }),
    new winston.transports.File({ filename: "./logs/all.log" }),
  ],
});

export default logger;
