FROM node:23.4-alpine

WORKDIR /app

COPY package*.json .

RUN npm install

COPY . .

EXPOSE 5001


CMD [ "npm", "run", "start" ]